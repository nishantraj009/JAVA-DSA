import java.util.*;

class Fancy {

    long MOD = 1000000007;
    List<Long> arr;
    long mul = 1;
    long add = 0;

    public Fancy() {
        arr = new ArrayList<>();
    }

    private long modInv(long x){
        return pow(x, MOD - 2);
    }

    private long pow(long a, long b){
        long res = 1;
        a %= MOD;
        while(b > 0){
            if((b & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }

    public void append(int val) {
        long v = (val - add + MOD) % MOD;
        v = (v * modInv(mul)) % MOD;
        arr.add(v);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mul = (mul * m) % MOD;
        add = (add * m) % MOD;
    }

    public int getIndex(int idx) {
        if(idx >= arr.size()) return -1;
        long val = arr.get(idx);
        return (int)((val * mul + add) % MOD);
    }
}
/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */