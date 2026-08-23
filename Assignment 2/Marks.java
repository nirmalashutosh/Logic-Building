class Marks {
    public static void main(String args[]) {

        int M = 80;
        int S = 85;
        int H = 90;

        int Average = (M+S+H)/3;
        System.out.println("The average marks is " + Average);

        String Grade = (Average >= 90) ? "A"
          : (Average >= 70 && Average <= 89) ? "B"
          : (Average >= 50 && Average <= 69) ? "C"
          : (Average >= 30 && Average <= 49) ? "D"
          : "Fail";

        System.out.println("Grade: " + Grade);
    }
}