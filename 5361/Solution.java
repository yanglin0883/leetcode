class Solution {
    public boolean checkOverlap(int radius, int x_center, int y_center, int x1, int y1, int x2, int y2) {
        if(x_center>=x1&&x_center<=x2&&y_center>=y1&&y_center<=y2) return true;
        int a1=x_center, b1 = y1;
        if(a1>x2)a1=x2;
        if(a1<x1)a1=x1;
        int a2=x_center, b2=y2;
        if(a2>x2)a2=x2;
        if(a2<x1)a2=x1;
        int a3 = x1, b3 = y_center;
        if(b3>y2)b3=y2;
        if(b3<y1)b3=y1;
        int a4 = x2, b4 = y_center;
        if(b4>y2)b4=y2;
        if(b4<y1)b4=y1;
        return inCircle(radius, x_center, y_center, a1, b1) ||
            inCircle(radius, x_center, y_center, a2, b2) ||
            inCircle(radius, x_center, y_center, a3, b3) ||
            inCircle(radius, x_center, y_center, a4, b4) ;
    }
    boolean inCircle(int r, int x0, int y0, int x1, int y1){
        return (x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) <= r*r;
    }
}