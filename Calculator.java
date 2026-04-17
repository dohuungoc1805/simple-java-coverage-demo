public class Calculator {

    /**
     * Phương thức tính tổng các số chẵn trong khoảng từ 1 đến n.
     * Có vòng lặp for và lệnh rẽ nhánh if-else.
     */
    public int sumEvenNumbers(int n) {
        if (n <= 0) {                    // Lệnh rẽ nhánh 1
            return 0;
        }
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {   // Vòng lặp for
            if (i % 2 == 0) {            // Lệnh rẽ nhánh 2 (inside loop)
                sum += i;
            } else {
                // Không làm gì (chỉ để có else branch)
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum even numbers up to 10: " + calc.sumEvenNumbers(10));  // Kết quả: 30 (2+4+6+8+10)
        System.out.println("Sum even numbers up to 0: " + calc.sumEvenNumbers(0));    // Kết quả: 0
    }
}