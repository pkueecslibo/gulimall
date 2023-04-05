package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {
        List<BrandEntity> brands= brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
        brands.forEach((item) -> {
            System.out.println(item);
        });
        System.out.println("save succeed ...");
    }
}
