package testngTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
 
public class SoftAssertion {
 
 @Test
 public void TestSoftAssert(){
 SoftAssert softAssertion= new SoftAssert();
 System.out.println("softAssert Method Was Started");
 softAssertion.assertTrue(false);
 System.out.println("softAssert Method Was Executed");
 softAssertion.assertAll();
 }
 
 @Test
 public void TestHardAssert(){
 System.out.println("hardAssert Method Was Started");
 Assert.assertTrue(false);
 System.out.println("hardAssert Method Was Executed");
 }
}