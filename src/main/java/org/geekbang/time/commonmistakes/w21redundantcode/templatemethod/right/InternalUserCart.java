package org.geekbang.time.commonmistakes.w21redundantcode.templatemethod.right;

import org.geekbang.time.commonmistakes.w21redundantcode.templatemethod.Item;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

//内部用户
@Service(value = "InternalUserCart")
public class InternalUserCart extends AbstractCart {
    // 无商品折扣
    @Override
    protected void processCouponPrice(long userId, Item item) {
        item.setCouponPrice(BigDecimal.ZERO);
    }

    // 免运费
    @Override
    protected void processDeliveryPrice(long userId, Item item) {
        item.setDeliveryPrice(BigDecimal.ZERO);
    }
}
