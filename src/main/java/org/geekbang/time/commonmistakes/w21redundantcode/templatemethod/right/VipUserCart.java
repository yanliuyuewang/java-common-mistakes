package org.geekbang.time.commonmistakes.w21redundantcode.templatemethod.right;

import org.geekbang.time.commonmistakes.w21redundantcode.templatemethod.Db;
import org.geekbang.time.commonmistakes.w21redundantcode.templatemethod.Item;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

// 继承了 NormalUserCart ， 运费 1 折 和普通用户一样
@Service(value = "VipUserCart")
public class VipUserCart extends NormalUserCart {

    @Override
    protected void processCouponPrice(long userId, Item item) {



        if (item.getQuantity() > 2) {
            item.setCouponPrice(item.getPrice()
                    .multiply(BigDecimal.valueOf(100 - Db.getUserCouponPercent(userId))
                            .divide(new BigDecimal("100")))
                    .multiply(BigDecimal.valueOf(item.getQuantity() - 2)));
        } else {
            item.setCouponPrice(BigDecimal.ZERO);
        }


    }
}
