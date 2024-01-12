package com.sample;

public class Demo {
    public static void main(String[] args) {
        Arith obj = new Arith();
        String s = null;
        try {
            obj.div(10, 2);
            obj.div(10, 2);
            obj.div(10, 2);
            s.length();

        }
        catch (ArithmeticException e) {
            System.out.println("dont divide by zero" + e);
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer EXCEPTION" + e);
        }
        catch(Exception e){
        }
        finally{
            obj.div(10, 5);
        }
    }
}
