package sm.model;

public class OrderCart {
    private Integer cartId;

    private Integer cartGssId;

    private Integer cartGoodsId;

    private Integer cartQuantity;

    private Double cartCouponPrice;

    private Double cartPrice;

    private Integer cartUid;

    private Integer cartDeleteStatus;

    private Integer cartType;

    private Integer cartRegionId;

    private String cartRegionName;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getCartGssId() {
        return cartGssId;
    }

    public void setCartGssId(Integer cartGssId) {
        this.cartGssId = cartGssId;
    }

    public Integer getCartGoodsId() {
        return cartGoodsId;
    }

    public void setCartGoodsId(Integer cartGoodsId) {
        this.cartGoodsId = cartGoodsId;
    }

    public Integer getCartQuantity() {
        return cartQuantity;
    }

    public void setCartQuantity(Integer cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

    public Double getCartCouponPrice() {
        return cartCouponPrice;
    }

    public void setCartCouponPrice(Double cartCouponPrice) {
        this.cartCouponPrice = cartCouponPrice;
    }

    public Double getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(Double cartPrice) {
        this.cartPrice = cartPrice;
    }

    public Integer getCartUid() {
        return cartUid;
    }

    public void setCartUid(Integer cartUid) {
        this.cartUid = cartUid;
    }

    public Integer getCartDeleteStatus() {
        return cartDeleteStatus;
    }

    public void setCartDeleteStatus(Integer cartDeleteStatus) {
        this.cartDeleteStatus = cartDeleteStatus;
    }

    public Integer getCartType() {
        return cartType;
    }

    public void setCartType(Integer cartType) {
        this.cartType = cartType;
    }

    public Integer getCartRegionId() {
        return cartRegionId;
    }

    public void setCartRegionId(Integer cartRegionId) {
        this.cartRegionId = cartRegionId;
    }

    public String getCartRegionName() {
        return cartRegionName;
    }

    public void setCartRegionName(String cartRegionName) {
        this.cartRegionName = cartRegionName;
    }
}