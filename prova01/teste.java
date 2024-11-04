public class Main {
    public static void main(String[] args) {
        char a = 'a', b = 'r', c = 'o', d = 'b', e = 'v', f = ' ', g = 'p', h = ' ', i = ' ';
        f = d;
        i = a;
        a = d;
        f = b;
        b = c;
        c = i;
        d = h;
        i = e;
        e = g;
        g = b;
        h = i;
        i = c;
        System.out.printf("%c %c %c %c %c %c %c %c %c", a, b, c, d, e, f, g, h, i);
    }
}
