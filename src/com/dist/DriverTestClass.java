package com.dist;

import com.dist.model.*;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author hh
 * @date 2019/02/28
 */
@RunWith(JUnit4.class)
public class DriverTestClass {
    @Test
    public void test01()throws Exception{
    	//（1）当获取到一条信息的时候，通过层层的解析，获得json数据
        String str ="{\"orderCode\":\"346\",\"userName\":\"136\",\"customerName\":\"小明\",\"provinceCode\":\"190\",\"cityCode\":\"000\",\"districtCode\":\"000\",\"customerAddress\":\"广东省广州市\",\"mobNum\":\"136\",\"orderSaleTime\":\"2019-02-01 23:04:26\",\"evaluationMark\":\"0\",\"invoiceHead\":\"小明\",\"orderTotalStatus\":\"30\",\"provinceName\":\"广东省\",\"cityName\":\"广州市\",\"districtName\":\"xX区\",\"sellerOrdRemark\":\"E3\",\"buyerOrdRemark\":\"\",\"invoiceType\":\"02\",\"invoice\":\"\",\"vatTaxpayerNumber\":\"\",\"registerAddress\":\"\",\"registerPhone\":\"\",\"bank\":\"\",\"account\":\"\",\"invoiceRecipientAddress\":\"\",\"invoiceRecipientName\":\"\",\"invoiceRecipientPhone\":\"\",\"invoiceRecipientHandPhone\":\"\",\"payType\":\"\",\"payTotalAmount\":\"\",\"needinvoiceflag\":\"Y\",\"isCanModifyTransportFee\":\"N\",\"guideAccountNo\":\"\",\"orderTime\":\"2019-02-01 23:02:53\",\"colorMarkFlags\":\"2\",\"phoneNum\":\"\",\"zipCode\":\"\",\"deliveryArea\":\"0200499\",\"detailAddress\":\"世外桃源\",\"countMoney\":\"490.00000\",\"sumDonationAmt\":\"0.00\",\"orderDetail\":[{\"productCode\":\"10668919671\",\"productName\":\"周生�?(CHOW SANG SANG)时尚黄金K金链18K金项�? 百搭素链 04800N18KY定价 40厘米\",\"unitPrice\":\"530.00000\",\"payAmount\":\"490.00000\",\"saleNum\":\"1.00000\",\"orderLineStatus\":\"30\",\"transportFee\":\"0.00000\",\"returnOrderFlag\":\"0\",\"coupontotalMoney\":\"40.00000\",\"vouchertotalMoney\":\"\",\"invCode\":\"\",\"orderLineNumber\":\"00662135679001\",\"itemCode\":\"04800N18KY-FJ-40-\",\"receivezipCode\":\"\",\"hwgFlag\":\"\",\"disType\":\"\",\"orderchannel\":\"MOBILE|01|01|7.4.2|20000\",\"prmtcode\":\"\",\"bLineNumber\":\"34662678213\",\"expresscompanycode\":\"E01\",\"expressno\":\"1154271476617\",\"phoneIdentifyCode\":\"\",\"payorderid\":\"\",\"packageorderid\":\"\",\"fpsdeliveryflag\":\"0\",\"activitytype\":\"\",\"reservedepositamount\":\"\",\"reservebalanceamount\":\"\",\"reservestatus\":\"\",\"mode\":\"\",\"itemTaxFare\":\"\",\"declareItemPrice\":\"\",\"declareItemTaxfare\":\"\",\"declareGoodsAmount\":\"\",\"carShopSerWay\":\"\",\"carShopCode\":\"\",\"carShopName\":\"\",\"carShopAddr\":\"\",\"carShopTel\":\"\",\"orderPayCode\":\"01\",\"dealPhoto\":\"http://sphss.suning.com/productspan/show.html?key=BkUDE9YNdQ4EkEshUJOTiAnYKNwU171TR5lXpgy%2F8UwpnL3SbTTXgW2LODzhNM7t\",\"isProsupplierDelivery\":\"0\",\"lpgOrderFlag\":\"\",\"serviceItemFlag\":\"0\",\"paymentList\":[{\"paycode\":\"6901\",\"banktypecode\":\"20001\",\"payamount\":\"30.00000\",\"offLinePayFlag\":\"\",\"alipayPayNo\":\"\"},{\"paycode\":\"6901\",\"banktypecode\":\"10006\",\"payamount\":\"10.00000\",\"offLinePayFlag\":\"\",\"alipayPayNo\":\"\"},{\"paycode\":\"6903\",\"banktypecode\":\"\",\"payamount\":\"0.01000\",\"offLinePayFlag\":\"\",\"alipayPayNo\":\"\"},{\"paycode\":\"4148\",\"banktypecode\":\"\",\"payamount\":\"489.99000\",\"offLinePayFlag\":\"\",\"alipayPayNo\":\"\"}],\"couponList\":[{\"coupontype\":\"8012\",\"sharelimit\":\"0.00000\"}],\"orderChannels\":[{\"orderChannelCode\":\"2\"}],\"activityTypes\":[],\"payTypes\":[],\"payerIdNumber\":\"\",\"payerCustomerName\":\"\",\"otoOrderType\":\"\",\"otoStoreCode\":\"\",\"otoStoreName\":\"\",\"expandAmount\":\"\",\"refVerifyCode\":\"\",\"orderServiceTypeMulti\":\"\",\"popContractInfo\":{},\"deliveryTime\":\"2019-02-02 13:33:52\",\"sendType\":\"1\",\"selfDeliveryName\":\"\",\"selfDeliveryMobile\":\"\",\"returnFlag\":\"\",\"complainFlag\":\"0\",\"logisticsOrderId\":\"E018\",\"carService\":{},\"orderTagList\":\"\",\"donationProjectInfo\":{\"donationProjectId\":\"\",\"donationAmt\":\"0.00\"}}]}";
        //(2)解析json数据，并把数据放到map里面
        JSONObject json = JSONObject.fromObject(str);
        Map classMap = new HashMap();
        classMap.put("orderDetail",OrderDetail.class);
        classMap.put("paymentList", Payment.class);
        classMap.put("couponList", Coupon.class);
        classMap.put("orderChannels", OrderChannel.class);
        classMap.put("donationProjectInfo",DonationProjectInfo.class);
        classMap.put("activityTypes", Object.class);
        //（3）这个作用是输出name和class
        JsonConfig config = new JsonConfig();
        config.setIgnoreDefaultExcludes(true);
        //（4）自动转化，塞进去实体类
        OrderGet orderGet = (OrderGet) JSONObject.toBean(json,OrderGet.class,classMap);
        //（5）通过实体类直接可以提取数据。十分方便快捷
        System.out.println("显示json中的数据："+orderGet.getOrderDetail().get(0).getProductCode());
        System.out.println("显示最外层json中的数据："+orderGet.getOrderCode()+","+orderGet.getOrderCode());
    }
}
