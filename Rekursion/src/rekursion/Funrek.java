/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursion;

/**
 *
 * @author Markus_Mayr
 */
public class Funrek {

    public int fakultaet(int n) {
        if (n == 1) {
            return 1;
        }
        return fakultaet(n - 1) * n;
    }

    public int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int ggt(int a, int b) {
        if (a < b) {
            return ggt(a, b - a);
        } else if (a > b) {
            return ggt(a - b, b);
        }
        return a;
    }

    public boolean palindrom(String a, int e, int l) {
        if (e == l || l == 1) {
            return true;
        }
        if (a.length() == 2 && a.charAt(e) == a.charAt(l)) {
            return true;
        } else if (a.charAt(e) == a.charAt(l)) {
            return palindrom(a, e + 1, l - 1);
        }
        return false;
    }

    public boolean primzahl(int p, int z) {
        if (p == 2 || p == 3) {
            return true;
        }
        if (p % z == 0 || p <= 1) {
            return false;
        }
        if (p == (z + 1)) {
            return true;
        }
        return primzahl(p, z + 1);
    }

    public boolean schwer(long a, int b){
        if(a % b == 0){
            schwer(a/10, b-1);
            if(b == 2)
                return true;
        }
        return false;
    }
    public void bewege(char a, char b, char c, int n) {
        if (n == 1) {
            System.out.println("Lege die oberste Scheibe von "
                    + "Turm " + a + " auf Turm " + c + ".");
        } else {
            bewege(a, c, b, n - 1);
            bewege(a, b, c, 1);
            bewege(b, a, c, n - 1);
        }
    }
}
