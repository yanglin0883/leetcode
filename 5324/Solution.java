class Cashier {
    int n, discount, i=0;
    Map<Integer, Integer> getPrice;
    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        getPrice = new HashMap();
        for(int i=0;i<products.length;i++){
            getPrice.put(products[i], prices[i]);
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        i++;
        double res = 0;
        for(int i=0;i<product.length;i++){
            res = res + getPrice.get(product[i]) * amount[i];
        }
        if(i%n==0){
            res = res - (discount * res) / 100;
        }
        return res;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */