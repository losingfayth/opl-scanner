package edu.bloomu;

/**
 * Driver file for testing Scanner class
 * 
 * @author fayth quinn
 */
public class App 
{
    public static void main( String[] args )
    {

        /*
         * TEST CASES - PASSERS
         */
        String  s01 = "$0",
                s02 = "$*0",
                s03 = "$*******0",
                s04 = "$0.00",
                s05 = "$*0.00",
                s06 = "$*******0.00",
                s07 = "$1",
                s08 = "$*1",
                s09 = "$*******1",
                s10 = "$1.00",
                s11 = "$*1.00",
                s12 = "$*******1.00",
                s13 = "$12",
                s14 = "$12.00",
                s15 = "$123",
                s16 = "$123.00",
                s17 = "$1,234",
                s18 = "$1,234.00",
                s19 = "$12,345",
                s20 = "$12,345.00",
                s21 = "$123,456",
                s22 = "$123,456.00",
                s23 = "$1,234,567",
                s24 = "$1,234,567.00";

        /*
         * TEST CASES - FAILERS
         */
        String  s25 = "0.00",
                s26 = "$000",
                s27 = "$01.00", //Passes
                s28 = "$1000.00",
                s29 = "$0.00$0.00",
                s30 = "$10*0.00",
                s31 = "$0.000",
                s32 = "$0.00**",
                s33 = "$0.0000",
                s34 = "$0.00aghnf",
                s35 = "$123,aghnf45.00",
                s36 = "aghnf$123.00",
                s37 = "$10000.00",
                s38 = "$100000.00",
                s39 = "$1000000.00",
                s40 = "$*********",
                s41 = "$*********.00",
                s42 = "$1,234.x8",
                s43 = "1,234.0",
                s44 = "1,234.",
                s45 = "$01";

        /*
         * TEST CASE - USER INPUT
         */
        String sCC = new String();

        /*
         * TESTING PRE-DEFINED INPUT
         */
        edu.bloomu.Scanner sc = new edu.bloomu.Scanner();
        java.util.Scanner in = new java.util.Scanner(System.in);

        String p = "\u001B[42m" + "PASS" + "\u001B[40m";    // "PASS" in Green
        String f = "\u001B[41m" + "FAIL" + "\u001B[40m";    // "FAIL" in Red

        System.out.printf("CASE 01: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s01, (sc.regex(s01) ? p : f), (sc.scan(s01) ? p : f), p);

        System.out.printf("CASE 02: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s02, (sc.regex(s02) ? p : f), (sc.scan(s02) ? p : f), p);

        System.out.printf("CASE 03: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s03, (sc.regex(s03) ? p : f), (sc.scan(s03) ? p : f), p);

        System.out.printf("CASE 04: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s04, (sc.regex(s04) ? p : f), (sc.scan(s04) ? p : f), p);

        System.out.printf("CASE 05: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s05, (sc.regex(s05) ? p : f), (sc.scan(s05) ? p : f), p);

        System.out.printf("CASE 06: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s06, (sc.regex(s06) ? p : f), (sc.scan(s06) ? p : f), p);

        System.out.printf("CASE 07: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s07, (sc.regex(s07) ? p : f), (sc.scan(s07) ? p : f), p);

        System.out.printf("CASE 08: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s08, (sc.regex(s08) ? p : f), (sc.scan(s08) ? p : f), p);

        System.out.printf("CASE 09: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s09, (sc.regex(s09) ? p : f), (sc.scan(s09) ? p : f), p);

        System.out.printf("CASE 10: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s10, (sc.regex(s10) ? p : f), (sc.scan(s10) ? p : f), p);

        System.out.printf("CASE 11: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s11, (sc.regex(s11) ? p : f), (sc.scan(s11) ? p : f), p);

        System.out.printf("CASE 12: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s12, (sc.regex(s12) ? p : f), (sc.scan(s12) ? p : f), p);

        System.out.printf("CASE 13: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s13, (sc.regex(s13) ? p : f), (sc.scan(s13) ? p : f), p);

        System.out.printf("CASE 14: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s14, (sc.regex(s14) ? p : f), (sc.scan(s14) ? p : f), p);

        System.out.printf("CASE 15: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s15, (sc.regex(s15) ? p : f), (sc.scan(s15) ? p : f), p);

        System.out.printf("CASE 16: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s16, (sc.regex(s16) ? p : f), (sc.scan(s16) ? p : f), p);

        System.out.printf("CASE 17: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s17, (sc.regex(s17) ? p : f), (sc.scan(s17) ? p : f), p);

        System.out.printf("CASE 18: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s18, (sc.regex(s18) ? p : f), (sc.scan(s18) ? p : f), p);

        System.out.printf("CASE 19: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s19, (sc.regex(s19) ? p : f), (sc.scan(s19) ? p : f), p);

        System.out.printf("CASE 20: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s20, (sc.regex(s20) ? p : f), (sc.scan(s20) ? p : f), p);
        
        System.out.printf("CASE 21: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s21, (sc.regex(s21) ? p : f), (sc.scan(s21) ? p : f), p);

        System.out.printf("CASE 22: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s22, (sc.regex(s22) ? p : f), (sc.scan(s22) ? p : f), p);

        System.out.printf("CASE 23: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s23, (sc.regex(s23) ? p : f), (sc.scan(s23) ? p : f), p);

        System.out.printf("CASE 24: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s24, (sc.regex(s24) ? p : f), (sc.scan(s24) ? p : f), p);

        System.out.printf("CASE 25: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s25, (sc.regex(s25) ? p : f), (sc.scan(s25) ? p : f), f);

        System.out.printf("CASE 26: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s26, (sc.regex(s26) ? p : f), (sc.scan(s26) ? p : f), f);

        System.out.printf("CASE 27: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s27, (sc.regex(s27) ? p : f), (sc.scan(s27) ? p : f), f);

        System.out.printf("CASE 28: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s28, (sc.regex(s28) ? p : f), (sc.scan(s28) ? p : f), f);

        System.out.printf("CASE 29: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s29, (sc.regex(s29) ? p : f), (sc.scan(s29) ? p : f), f);

        System.out.printf("CASE 30: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s30, (sc.regex(s30) ? p : f), (sc.scan(s30) ? p : f), f);

        System.out.printf("CASE 31: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s31, (sc.regex(s31) ? p : f), (sc.scan(s31) ? p : f), f);

        System.out.printf("CASE 32: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s32, (sc.regex(s32) ? p : f), (sc.scan(s32) ? p : f), f);

        System.out.printf("CASE 33: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s33, (sc.regex(s33) ? p : f), (sc.scan(s33) ? p : f), f);

        System.out.printf("CASE 34: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s34, (sc.regex(s34) ? p : f), (sc.scan(s34) ? p : f), f);

        System.out.printf("CASE 35: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s35, (sc.regex(s35) ? p : f), (sc.scan(s35) ? p : f), f);

        System.out.printf("CASE 36: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s36, (sc.regex(s36) ? p : f), (sc.scan(s36) ? p : f), f);

        System.out.printf("CASE 37: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s37, (sc.regex(s37) ? p : f), (sc.scan(s37) ? p : f), f);

        System.out.printf("CASE 38: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s38, (sc.regex(s38) ? p : f), (sc.scan(s38) ? p : f), f);

        System.out.printf("CASE 39: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s39, (sc.regex(s39) ? p : f), (sc.scan(s39) ? p : f), f);

        System.out.printf("CASE 40: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s40, (sc.regex(s40) ? p : f), (sc.scan(s40) ? p : f), f);

        System.out.printf("CASE 41: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s41, (sc.regex(s41) ? p : f), (sc.scan(s41) ? p : f), f);

        System.out.printf("CASE 42: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s42, (sc.regex(s42) ? p : f), (sc.scan(s42) ? p : f), f);
        
        System.out.printf("CASE 43: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s43, (sc.regex(s43) ? p : f), (sc.scan(s43) ? p : f), f);

        System.out.printf("CASE 44: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s44, (sc.regex(s44) ? p : f), (sc.scan(s44) ? p : f), f);

        System.out.printf("CASE 45: %16s\tREGEX:%s\tSCAN:%s\tEXPECT:%s\n", s45, (sc.regex(s45) ? p : f), (sc.scan(s45) ? p : f), f);


        /*
         * TESTING CUSTOM INPUT
         */
        while (true) {

            System.out.print("\n\nQ TO QUIT or ENTER CUSTOM CASE: ");

            if (in.hasNext("Q") || in.hasNext("q")) break;

            sCC = in.nextLine();

            if (sCC != "Q" && sCC != "q") {
                System.out.printf("CASE CC: %16s\tREGEX:%s\tSCAN:%s\n", sCC, (sc.regex(sCC) ? p : f), (sc.scan(sCC) ? p : f));
            }

        }

        in.close();

    }
}