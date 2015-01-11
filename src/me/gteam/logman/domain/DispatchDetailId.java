package me.gteam.logman.domain;

import java.util.Date;


/**
 * DispatchDetailId entity. @author MyEclipse Persistence Tools
 */

public class DispatchDetailId  implements java.io.Serializable {


    // Fields    

     private Integer detailId;
     private Integer dispatchId;
     private Date deliveryDate;
     private Integer shipper;
     private Integer consignee;
     private Integer routerName;
     private Integer goods;
     private String iswhole;
     private Integer ladingNo;
     private String pickupAddress;
     private String deliveryAddress;
     private Integer orderId;
     private Double dispatchAmount;
     private Double actualAmount;
     private String unit;
     private String remark;


    // Constructors

    /** default constructor */
    public DispatchDetailId() {
    }

    
    /** full constructor */
    public DispatchDetailId(Integer detailId, Integer dispatchId, Date deliveryDate, Integer shipper, Integer consignee, Integer routerName, Integer goods, String iswhole, Integer ladingNo, String pickupAddress, String deliveryAddress, Integer orderId, Double dispatchAmount, Double actualAmount, String unit, String remark) {
        this.detailId = detailId;
        this.dispatchId = dispatchId;
        this.deliveryDate = deliveryDate;
        this.shipper = shipper;
        this.consignee = consignee;
        this.routerName = routerName;
        this.goods = goods;
        this.iswhole = iswhole;
        this.ladingNo = ladingNo;
        this.pickupAddress = pickupAddress;
        this.deliveryAddress = deliveryAddress;
        this.orderId = orderId;
        this.dispatchAmount = dispatchAmount;
        this.actualAmount = actualAmount;
        this.unit = unit;
        this.remark = remark;
    }

   
    // Property accessors

    public Integer getDetailId() {
        return this.detailId;
    }
    
    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getDispatchId() {
        return this.dispatchId;
    }
    
    public void setDispatchId(Integer dispatchId) {
        this.dispatchId = dispatchId;
    }

    public Date getDeliveryDate() {
        return this.deliveryDate;
    }
    
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Integer getShipper() {
        return this.shipper;
    }
    
    public void setShipper(Integer shipper) {
        this.shipper = shipper;
    }

    public Integer getConsignee() {
        return this.consignee;
    }
    
    public void setConsignee(Integer consignee) {
        this.consignee = consignee;
    }

    public Integer getRouterName() {
        return this.routerName;
    }
    
    public void setRouterName(Integer routerName) {
        this.routerName = routerName;
    }

    public Integer getGoods() {
        return this.goods;
    }
    
    public void setGoods(Integer goods) {
        this.goods = goods;
    }

    public String getIswhole() {
        return this.iswhole;
    }
    
    public void setIswhole(String iswhole) {
        this.iswhole = iswhole;
    }

    public Integer getLadingNo() {
        return this.ladingNo;
    }
    
    public void setLadingNo(Integer ladingNo) {
        this.ladingNo = ladingNo;
    }

    public String getPickupAddress() {
        return this.pickupAddress;
    }
    
    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }
    
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getDispatchAmount() {
        return this.dispatchAmount;
    }
    
    public void setDispatchAmount(Double dispatchAmount) {
        this.dispatchAmount = dispatchAmount;
    }

    public Double getActualAmount() {
        return this.actualAmount;
    }
    
    public void setActualAmount(Double actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DispatchDetailId) ) return false;
		 DispatchDetailId castOther = ( DispatchDetailId ) other; 
         
		 return ( (this.getDetailId()==castOther.getDetailId()) || ( this.getDetailId()!=null && castOther.getDetailId()!=null && this.getDetailId().equals(castOther.getDetailId()) ) )
 && ( (this.getDispatchId()==castOther.getDispatchId()) || ( this.getDispatchId()!=null && castOther.getDispatchId()!=null && this.getDispatchId().equals(castOther.getDispatchId()) ) )
 && ( (this.getDeliveryDate()==castOther.getDeliveryDate()) || ( this.getDeliveryDate()!=null && castOther.getDeliveryDate()!=null && this.getDeliveryDate().equals(castOther.getDeliveryDate()) ) )
 && ( (this.getShipper()==castOther.getShipper()) || ( this.getShipper()!=null && castOther.getShipper()!=null && this.getShipper().equals(castOther.getShipper()) ) )
 && ( (this.getConsignee()==castOther.getConsignee()) || ( this.getConsignee()!=null && castOther.getConsignee()!=null && this.getConsignee().equals(castOther.getConsignee()) ) )
 && ( (this.getRouterName()==castOther.getRouterName()) || ( this.getRouterName()!=null && castOther.getRouterName()!=null && this.getRouterName().equals(castOther.getRouterName()) ) )
 && ( (this.getGoods()==castOther.getGoods()) || ( this.getGoods()!=null && castOther.getGoods()!=null && this.getGoods().equals(castOther.getGoods()) ) )
 && ( (this.getIswhole()==castOther.getIswhole()) || ( this.getIswhole()!=null && castOther.getIswhole()!=null && this.getIswhole().equals(castOther.getIswhole()) ) )
 && ( (this.getLadingNo()==castOther.getLadingNo()) || ( this.getLadingNo()!=null && castOther.getLadingNo()!=null && this.getLadingNo().equals(castOther.getLadingNo()) ) )
 && ( (this.getPickupAddress()==castOther.getPickupAddress()) || ( this.getPickupAddress()!=null && castOther.getPickupAddress()!=null && this.getPickupAddress().equals(castOther.getPickupAddress()) ) )
 && ( (this.getDeliveryAddress()==castOther.getDeliveryAddress()) || ( this.getDeliveryAddress()!=null && castOther.getDeliveryAddress()!=null && this.getDeliveryAddress().equals(castOther.getDeliveryAddress()) ) )
 && ( (this.getOrderId()==castOther.getOrderId()) || ( this.getOrderId()!=null && castOther.getOrderId()!=null && this.getOrderId().equals(castOther.getOrderId()) ) )
 && ( (this.getDispatchAmount()==castOther.getDispatchAmount()) || ( this.getDispatchAmount()!=null && castOther.getDispatchAmount()!=null && this.getDispatchAmount().equals(castOther.getDispatchAmount()) ) )
 && ( (this.getActualAmount()==castOther.getActualAmount()) || ( this.getActualAmount()!=null && castOther.getActualAmount()!=null && this.getActualAmount().equals(castOther.getActualAmount()) ) )
 && ( (this.getUnit()==castOther.getUnit()) || ( this.getUnit()!=null && castOther.getUnit()!=null && this.getUnit().equals(castOther.getUnit()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getDetailId() == null ? 0 : this.getDetailId().hashCode() );
         result = 37 * result + ( getDispatchId() == null ? 0 : this.getDispatchId().hashCode() );
         result = 37 * result + ( getDeliveryDate() == null ? 0 : this.getDeliveryDate().hashCode() );
         result = 37 * result + ( getShipper() == null ? 0 : this.getShipper().hashCode() );
         result = 37 * result + ( getConsignee() == null ? 0 : this.getConsignee().hashCode() );
         result = 37 * result + ( getRouterName() == null ? 0 : this.getRouterName().hashCode() );
         result = 37 * result + ( getGoods() == null ? 0 : this.getGoods().hashCode() );
         result = 37 * result + ( getIswhole() == null ? 0 : this.getIswhole().hashCode() );
         result = 37 * result + ( getLadingNo() == null ? 0 : this.getLadingNo().hashCode() );
         result = 37 * result + ( getPickupAddress() == null ? 0 : this.getPickupAddress().hashCode() );
         result = 37 * result + ( getDeliveryAddress() == null ? 0 : this.getDeliveryAddress().hashCode() );
         result = 37 * result + ( getOrderId() == null ? 0 : this.getOrderId().hashCode() );
         result = 37 * result + ( getDispatchAmount() == null ? 0 : this.getDispatchAmount().hashCode() );
         result = 37 * result + ( getActualAmount() == null ? 0 : this.getActualAmount().hashCode() );
         result = 37 * result + ( getUnit() == null ? 0 : this.getUnit().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         return result;
   }   





}