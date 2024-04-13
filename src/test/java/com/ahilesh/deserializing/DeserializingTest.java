package com.ahilesh.deserializing;

import com.ahilesh.pojo.DeSerializingPojo.DataPojo;
import com.ahilesh.pojo.DeSerializingPojo.ListUsersPojo;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.List;

public class DeserializingTest {

    @Test

    public void DeserTest(){
        RestAssured.baseURI="https://reqres.in/api/users?page=2";

      //  ListUsersPojo pojo=new ListUsersPojo() ;


        ListUsersPojo pojo= RestAssured.given().when().get().as(ListUsersPojo.class);

        System.out.println("pojo.toString() = " + pojo.toString());

        List <DataPojo> list=pojo.getData();
        for (int i=0;i<list.size();i++){
            System.out.println("\"This is my \"+i+ \"element\"+list.get(i) = " + "This is my " + i + "element" + list.get(i));
        }

    }


}
