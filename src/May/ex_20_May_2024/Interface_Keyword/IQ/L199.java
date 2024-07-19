package May.ex_20_May_2024.Interface_Keyword.IQ;

public class L199 {
}

interface I1{}
interface I2{}

class a{}
class b{}

abstract class c{}

class t1 extends a{}  // Possible , single inheritance
class t2 extends b{}
//class t3 extends a{},b{} // not possible , multiple inheritance with class not allowed.
class t4 implements I1, I2{} // possible multiple inheritance using interface
class t5 extends a implements I1,I2{}
//class t6 implements I1 extends a{} // not possible
//interface I3 extends a{} // not possible
//interface I4 implements a{} // not possible
//interface I5 extends a,b{} // not possible
interface I6 extends I1,I2{}
//interface I7 extends c{};



