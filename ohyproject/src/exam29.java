public class exam29 {
    public static void main(String[] args) {
        String[] _StrSubject = { "국어", "영어", "수학" };
        String maxStr = "";
        String minStr = "";
        double sum = 0;
        double _avrage = 0;
        double nMax = -999;
        double nMin = 100;
        for (int i = 0; i < _StrSubject.length; i++) {
            double score = Double.parseDouble(args[i]);
            System.out.println(_StrSubject[i] + " : " + score);
            double _args = score;
            if (nMax < score) {
                nMax = _args;
                maxStr = _StrSubject[i];
            }
            if (nMin > score) {
                nMin = _args;
                minStr = _StrSubject[i];
                // double value = Double.parseDouble(_arg);
                // sum += value;
            }
            sum += score;

        }
        double argl = args.length;
        _avrage = sum / argl;

        System.out.println("최고 점수 과목" + maxStr + " : " + nMax); // + maxStr + 
        System.out.println("최저 점수 과목" + minStr + " : " + nMin); // + minStr + 
        // System.out.println("더한값 : "+ nSum);
        System.out.println("평균값 : " + _avrage);
        // System.out.println("최대값 : "+ nMax);
    }
}
