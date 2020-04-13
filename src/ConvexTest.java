//Тест для выпуклой оболочки.
class ConvexTest{
    public static void main(String[] args) throws Exception{
        Convex convex = new Convex();

        while(true){
            Frame m = new Frame(convex);
            convex.add(new R2Point());

            System.out.println("S = " + convex.area()+ ", P = " + convex.perimeter());
            m.dispose();
        }
    }
}
