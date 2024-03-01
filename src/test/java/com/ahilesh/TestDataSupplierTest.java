package com.ahilesh;

import com.ahilesh.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;

public class TestDataSupplierTest {

    @Test(dataProvider="getData")
 
    public void dataSupplierTest(TestData testData){

        System.out.println("testData.userName = " + testData.userName);
        System.out.println("testData.passWord = " + testData.passWord);
        System.out.println("testData.testCaseName = " + testData.testCaseName);

    }

    @DataSupplier
    public StreamEx<TestData> getData(){
        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read();
    }
}
