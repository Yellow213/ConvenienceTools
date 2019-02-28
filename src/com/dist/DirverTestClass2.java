package com.dist;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class DirverTestClass2 {

/**
 * @author hh
 * @date 2019/02/28
 * @方法二：不直接转实体类，通过层层提取节点提取数据
 * 备注：
 * 方法一：那种方法是将所有的东西都要解析出来，其实好几个类压根没用用的，也就是说那几个类其实是垃圾类，但是如果不写，那么就会报错。
 * 方法二：
 * 优点：按照需求去提取数据，不需要写多余无关的类，且不容易报错。（提取数据少的时候推荐使用）
 * 缺点：维护性较差，每次提取多一个节点数据，需要人工去写。
 */
	@Test
	public void test() {
        String str ="{\"orderCode\":\"346\",\"userName\":\"136\",\"customerName\":\"小明\",\"provinceCode\":\"190\",\"cityCode\":\"000\",\"districtCode\":\"000\",\"customerAddress\":\"广东省广州市\",\"mobNum\":\"136\",\"orderSaleTime\":\"2019-02-01 23:04:26\",\"evaluationMark\":\"0\",\"invoiceHead\":\"小明\",\"orderTotalStatus\":\"30\",\"provinceName\":\"广东省\",\"cityName\":\"广州市\",\"districtName\":\"xX区\",\"sellerOrdRemark\":\"E3\",\"buyerOrdRemark\":\"\",\"invoiceType\":\"02\",\"invoice\":\"\",\"vatTaxpayerNumber\":\"\",\"registerAddress\":\"\",\"registerPhone\":\"\",\"bank\":\"\",\"account\":\"\",\"invoiceRecipientAddress\":\"\",\"invoiceRecipientName\":\"\",\"invoiceRecipientPhone\":\"\",\"invoiceRecipientHandPhone\":\"\",\"payType\":\"\",\"payTotalAmount\":\"\",\"needinvoiceflag\":\"Y\",\"isCanModifyTransportFee\":\"N\",\"guideAccountNo\":\"\",\"orderTime\":\"2019-02-01 23:02:53\",\"colorMarkFlags\":\"2\",\"phoneNum\":\"\",\"zipCode\":\"\",\"deliveryArea\":\"0200499\",\"detailAddress\":\"世外桃源\",\"countMoney\":\"490.00000\",\"sumDonationAmt\":\"0.00\",\"orderDetail\":[{\"productCode\":\"10668919671\",\"productName\":\"周生�?(CHOW SANG SANG)时尚黄金K金链18K金项�? 百搭素链 04800N18KY定价 40厘米\",\"unitPrice\":\"530.00000\",\"payAmount\":\"490.00000\",\"saleNum\":\"1.00000\",\"orderLineStatus\":\"30\",\"transportFee\":\"0.00000\",\"returnOrderFlag\":\"0\",\"coupontotalMoney\":\"40.00000\",\"vouchertotalMoney\":\"\",\"invCode\":\"\",\"orderLineNumber\":\"00662135679001\",\"itemCode\":\"04800N18KY-FJ-40-\",\"receivezipCode\":\"\",\"hwgFlag\":\"\",\"disType\":\"\",\"orderchannel\":\"MOBILE|01|01|7.4.2|20000\",\"prmtcode\":\"\",\"bLineNumber\":\"34662678213\",\"expresscompanycode\":\"E01\",\"expressno\":\"1154271476617\",\"phoneIdentifyCode\":\"\",\"payorderid\":\"\",\"packageorderid\":\"\",\"fpsdeliveryflag\":\"0\",\"activitytype\":\"\",\"reservedepositamount\":\"\",\"reservebalanceamount\":\"\",\"reservestatus\":\"\",\"mode\":\"\",\"itemTaxFare\":\"\",\"declareItemPrice\":\"\",\"declareItemTaxfare\":\"\",\"declareGoodsAmount\":\"\",\"carShopSerWay\":\"\",\"carShopCode\":\"\",\"carShopName\":\"\",\"carShopAddr\":\"\",\"carShopTel\":\"\",\"orderPayCode\":\"01\",\"dealPhoto\":\"http://sphss.suning.com/productspan/show.html?key=BkUDE9YNdQ4EkEshUJOTiAnYKNwU171TR5lXpgy%2F8UwpnL3SbTTXgW2LODzhNM7t\",\"isProsupplierDelivery\":\"0\",\"lpgOrderFlag\":\"\",\"serviceItemFlag\":\"0\",\"paymentList\":[{\"paycode\":\"6901\",\"banktypecode\":\"20001\",\"payamount\":\"30.00000\",\"offLinePayFlag\":\"\",\"alipayPayNo\":\"\"},{\"paycode\":\"6901\",\"banktypecode\":\"10006\",\"payamount\":\"10.00000\",\"offLinePayFlag\":\"\",\"alipayPayNo\":\"\"},{\"paycode\":\"6903\",\"banktypecode\":\"\",\"payamount\":\"0.01000\",\"offLinePayFlag\":\"\",\"alipayPayNo\":\"\"},{\"paycode\":\"4148\",\"banktypecode\":\"\",\"payamount\":\"489.99000\",\"offLinePayFlag\":\"\",\"alipayPayNo\":\"\"}],\"couponList\":[{\"coupontype\":\"8012\",\"sharelimit\":\"0.00000\"}],\"orderChannels\":[{\"orderChannelCode\":\"2\"}],\"activityTypes\":[],\"payTypes\":[],\"payerIdNumber\":\"\",\"payerCustomerName\":\"\",\"otoOrderType\":\"\",\"otoStoreCode\":\"\",\"otoStoreName\":\"\",\"expandAmount\":\"\",\"refVerifyCode\":\"\",\"orderServiceTypeMulti\":\"\",\"popContractInfo\":{},\"deliveryTime\":\"2019-02-02 13:33:52\",\"sendType\":\"1\",\"selfDeliveryName\":\"\",\"selfDeliveryMobile\":\"\",\"returnFlag\":\"\",\"complainFlag\":\"0\",\"logisticsOrderId\":\"E018\",\"carService\":{},\"orderTagList\":\"\",\"donationProjectInfo\":{\"donationProjectId\":\"\",\"donationAmt\":\"0.00\"}}]}";
        //(1)解析json数据，并把数据放到map里面
        JSONObject json = JSONObject.fromObject(str);
	    JSONObject obj = JSONObject.fromObject(json);
	    System.out.println(obj.getString("orderCode"));
	    System.out.println(obj.getString("userName"));
	    System.out.println(obj.getString("customerName"));
	    System.out.println(obj.getString("customerAddress"));
	    System.out.println(obj.getString("mobNum"));
	    System.out.println(obj.getString("orderSaleTime"));
	    System.out.println(obj.getString("orderTotalStatus"));
	    System.out.println(obj.getString("provinceCode"));
	    System.out.println(obj.getString("cityCode"));
	    System.out.println(obj.getString("districtName"));
	    System.out.println(obj.getString("sellerOrdRemark"));
	    //（2）解析下边一层，提取数组里面第一个json里面的节点
	    JSONArray json2 = json.getJSONArray("orderDetail");
	    JSONObject obj2 = JSONObject.fromObject(json2.get(0));
	    System.out.println("继续解析里面的一层，提取自己需要的数据");
	    System.out.println("obj2.getJSONObject(\"donationProjectInfo\").getString(\"donationAmt\"):"+obj2.getJSONObject("donationProjectInfo").getString("donationAmt"));
	    
	}

}
