package com.example.Thymeleaf.domain;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 초기 데이터 저장을 위한 클래스
 */
@Component
@RequiredArgsConstructor
public class InitData {

    private final ProductInMemoryRepository productInMemoryRepository;

    /**
     * @PostContruct
     * 해당 어노테이션은 의존성 주입이 완료된 후 실행되어야 하는 메서드에 사용한다.
     * 다른 리소스에서 호출되지 않아도 실행된다.
     * Spring Bean의 생명주기에서 오직 한번만 수행되는것을 보장한다.
     * 생성자 보다 늦게 호출된다.
     *
     * 결과 : Application 시작시 항상 초기 데이터가 저장된다.
     */
    @PostConstruct
    public void initData() {
        Product product1 = new Product("상품1", 5, 10000);
        Product product2 = new Product("상품2", 10, 20000);
        Product product3 = new Product("상품3", 20, 30000);

        productInMemoryRepository.save(product1);
        productInMemoryRepository.save(product2);
        productInMemoryRepository.save(product3);
    }
}