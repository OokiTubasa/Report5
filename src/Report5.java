/*
class Report5{
    public static void main(String[] args) throws NullPointerException{
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println(e.getMessage());
        }
    }  
}
*/

class Report5{
    public static void main(String[] args) throws NullPointerException{
        String str = "百二十三";
        int value = Integer.parseInt(str);
    }
}
        