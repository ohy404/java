public class aa {

        public static void main(String[] args) {
            int height = 5; // 삼각형 높이
    
            // 삼각형 그리기
            for (int i = 0; i < height; i++) {
                // 공백 출력
                for (int j = 0; j < height - i - 1; j++) {
                    System.out.print(" ");
                }
                // 별표 출력
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
                // 줄 바꿈
                System.out.println();
            }
        }
    }
