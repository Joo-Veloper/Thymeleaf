package com.example.Thymeleaf.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 주의 : @RestController가 아닌 @Controller를 사용한다.
 * return Type이 String이면 Data가 아닌 View Template을 반환한다.
 */
@Slf4j
@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductInMemoryRepository productInMemoryRepository;

    @ModelAttribute("colors")
    public Map<String, String> colors() {
        // 순서를 보장하기 위해 Linked HashMap 사용
        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("RED", "빨강");
        colors.put("BLUE", "파랑");
        colors.put("BLACK", "검정");

        return colors;
    }

    @ModelAttribute("productTypes")
    public ProductType[] productTypes() {
        return ProductType.values();
    }

    @ModelAttribute("deliveries")
    public List<Delivery> deliveries() {
        List<Delivery> deliveries = new ArrayList<>();
        deliveries.add(new Delivery("QUICK", "퀵배송"));
        deliveries.add(new Delivery("NORMAL", "택배배송"));
        deliveries.add(new Delivery("DIRECT", "직접수령"));

        return deliveries;
    }

    /**
     * 전체 상품 조회 페이지
     * @param model model 객체
     * @return View Template resources/templates/form/productList.html
     */
    @GetMapping
    public String findAllProducts(Model model) {
        List<Product> productList = productInMemoryRepository.findAll();
        model.addAttribute("productList", productList);
        return "form/productList";
    }

    /**
     * 단일 상품 조회 페이지
     * @param productId 조회할 상품 ID
     * @param model model 객체
     * @return View Template resources/templates/form/product.html
     */
    @GetMapping("/{productId}")
    public String item(@PathVariable long productId, Model model) {
        Product product = productInMemoryRepository.findById(productId);
        model.addAttribute("product", product);
        return "form/product";
    }

//    /**
//     * 상품 추가 Form 페이지
//     * @return View Template resources/templates/form/addProductForm.html
//     */
//    @GetMapping("/add")
//    public String addForm() {
//        return "form/addProductForm";
//    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("product", new Product());
        return "form/addProductForm";
    }


    /**
     * 상품 추가 API
     * @param product 추가할 상품 Data
     * @param redirectAttributes Redirect Attribute를 전달하는 객체
     *                           save : Parameter로 boolean 전달, product.html 페이지에서 th:if 처리에 사용
     * @return Post(상품추가) -> Redirect URL 전달 -> Get(단일 상품 조회)
     */
    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {

        // @Slf4j 를 Controller 상단 어노테이션으로 추가해야 합니다.
        log.info("product.getIsUsed={}", product.getIsUsed());
        log.info("product.getColors={}", product.getColors());
        log.info("product.getProductType={}", product.getProductType());

        Product savedProduct = productInMemoryRepository.save(product);
        redirectAttributes.addAttribute("productId", savedProduct.getId());
        redirectAttributes.addAttribute("save", true);
        return "redirect:/products/{productId}";
    }

    /**
     * 상품 수정 입력 Form 페이지
     * @param productId 조회할 product ID
     * @param model model 객체
     * @return View Template resources/templates/form/updateProductForm.html
     */
    @GetMapping("/{productId}/update")
    public String updateForm(@PathVariable Long productId, Model model) {
        Product findProduct = productInMemoryRepository.findById(productId);
        model.addAttribute("product", findProduct);
        return "form/updateProductForm";
    }

    /**
     * 상품 수정 API
     * @param productId 수정할 Product ID
     * @param product 수정 Data
     * @return Post(상품 수정) -> Redirect URL 전달 -> Get(단일 상품 조회)
     */
    @PostMapping("/{productId}/update")
    public String edit(@PathVariable Long productId, @ModelAttribute Product product) {
        productInMemoryRepository.update(productId, product);
        return "redirect:/products/{productId}";
    }

}