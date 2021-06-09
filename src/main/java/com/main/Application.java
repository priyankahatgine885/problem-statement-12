package com.main;

public class Application {
        public static void main(String[] args) {
            patternPrint(5);
        }
        private static void patternPrint(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.println();
                printNchar(n - i, ' ');
                printDescendingNos(i, 1);
                printAscendingNos(2, i);
            }
        }
        private static void printDescendingNos(int startNo, int endNo) {
            while (startNo >= endNo) {
                System.out.print("\t" + startNo);
                startNo--;
            }
        }
        private static void printAscendingNos(int startNo, int endeNo) {
            while (startNo <= endeNo) {
                System.out.print("\t" + startNo);
                startNo++;
            }
        }
        private static void printNchar(int n, char ch) {
            while (n > 0) {
                System.out.print("\t" + ch);
                n--;
            }
        }

}
