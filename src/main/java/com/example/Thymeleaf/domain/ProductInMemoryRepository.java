package com.example.Thymeleaf.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 임시로 실제 DB가 아닌 Memory를 사용한다.
 * 참고 : 서버를 재시작하면 저장되어 있던 Data가 사라지게 됩니다.
 */
@Repository
public class ProductInMemoryRepository {

    /**
     * 메모리 저장소
     */
    private static final Map<Long, Product> storage = new HashMap<>();

    /**
     * Primary Key ID 값으로 사용할 sequence
     */
    private static long sequence = 0L;

    /**
     * 상품 저장
     * @param product product Data
     * @return 저장된 product
     */
    public Product save(Product product) {
        product.setId(++sequence);
        storage.put(product.getId(), product);
        return product;
    }

    /**
     * 단일 상품 조회
     * @param id 조회할 상품의 (product)ID
     * @return 조회된 Product Data
     */
    public Product findById(Long id) {
        return storage.get(id);
    }

    /**
     * 전체 상품 조회
     * @return 전체 Product List
     */
    public List<Product> findAll() {
        return new ArrayList<>(storage.values());
    }

    /**
     * 상품 수정
     * @param productId 수정할 상품의 ID
     * @param updateData 수정할 상품 Data
     */
    public void update(Long productId, Product updateData) {
        Product findProduct = findById(productId);
        findProduct.setName(updateData.getName());
        findProduct.setPrice(updateData.getPrice());
        findProduct.setQuantity(updateData.getQuantity());
        findProduct.setIsUsed(updateData.getIsUsed());
        findProduct.setColors(updateData.getColors());
        findProduct.setDelivery(updateData.getDelivery());
        findProduct.setProductType(updateData.getProductType());
    }

    /**
     * 저장소 비우기
     */
    public void clearStore() {
        storage.clear();
    }
}