package com.erato.exampleforpagehelperintegration;

import com.erato.exampleforpagehelperintegration.dao.BrandDao;
import com.erato.exampleforpagehelperintegration.entity.Brand;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ExampleForPagehelperIntegrationApplication implements CommandLineRunner {
    
    @Autowired
    BrandDao brandDao;
    
    public static void main(String[] args) {
        SpringApplication.run(ExampleForPagehelperIntegrationApplication.class, args);
    }
    
    
    /* Official Example from https://github.com/pagehelper/Mybatis-PageHelper */
    
    /* This Application class implements Spring Boot’s CommandLineRunner, which means it will execute the run() method after the application context is loaded.
    * https://spring.io/guides/gs/relational-data-access/
    */
    public void run(String... args) throws Exception {
        PageHelper.startPage(1,5);
        List<Brand> brands = brandDao.selectAll();
        System.out.println("Total: " + ((Page)brands).getTotal());
        for (Brand brand : brands) {
            System.out.println("Brand: " + brand.getName());
        }
    }
    
}
