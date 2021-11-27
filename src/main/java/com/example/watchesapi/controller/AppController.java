package com.example.watchesapi.controller;

import com.example.watchesapi.model.*;
import com.example.watchesapi.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class AppController {

    @Autowired
    private AppService appService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public List<Account> getListAccount(){
        return appService.getListAccount();
    }
    @RequestMapping(value = "/login/{username}",method = RequestMethod.GET)
    public Account getAccount(@PathVariable String username){
        return appService.getAccount(username);
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void addAccount(@RequestBody Account account){
        appService.addAccount(account);
    }
    @RequestMapping(value = "/login/{username}",method = RequestMethod.PUT)
    public void updateAccount(@RequestBody Account account , @PathVariable String username){
        appService.updateAccount(username,account);
    }


    @RequestMapping(value = "/trademark",method = RequestMethod.GET)
    public List<Trademark> getListTrademark(){
        return appService.getListTrademark();
    }



    @RequestMapping(value ="/product/{idTrademark}",method = RequestMethod.GET)
    public List<Product> getListProduct(@PathVariable int idTrademark){
        return appService.getListProduct(idTrademark);
    }
    @RequestMapping(value = "/product/news",method = RequestMethod.GET)
    public List<Product> getListProductNews(){
        return appService.getListProductNews();
    }


    @RequestMapping(value = "/cart",method = RequestMethod.GET)
    public List<Cart> getListCart(){
        return appService.getListCart();
    }
    @RequestMapping(value = "/cart",method = RequestMethod.POST)
    public void addCart(@RequestBody Cart cart){
        appService.addCart(cart);
    }
    @RequestMapping(value = "/cart/{id}",method = RequestMethod.DELETE)
    public void deleteCart(@PathVariable String id){
         appService.deleteCart(id);
    }


    @RequestMapping(value = "/cartdetail",method = RequestMethod.GET)
    public List<CartDetail> getListCartDetail(){
        return appService.getListCartDetail();
    }

    @RequestMapping(value = "/cartdetail",method = RequestMethod.POST)
    public void addCartDetail(@RequestBody List<CartDetail> listCartDetail){
        appService.addListCartDetail(listCartDetail);
    }

}
