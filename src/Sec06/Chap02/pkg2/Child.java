package Sec06.Chap02.pkg2;

import Sec06.Chap02.pkg1.Parent;

public class Child extends Parent {
//    Parent와 다른 패키지
//    int aa = a; // ⚠️ 불가
//    int bb = b; // ⚠️ 불가
    int cc = c; // 💡protected - 다른 패키지, 상속관계
    int dd = d;
}
