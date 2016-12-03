package _2;

/**
 * Created by kinder112 on 03.12.2016.
 */
enum KeyPad2 implements KeypadMovement<KeyPad2> {
    _1 {
        @Override
        public KeyPad2 up() {
            return KeyPad2._1;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._3;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._1;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._1;
        }
    },
    _2 {
        @Override
        public KeyPad2 up() {
            return KeyPad2._2;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._6;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._2;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._3;
        }
    },
    _3 {
        @Override
        public KeyPad2 up() {
            return KeyPad2._1;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._7;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._2;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._4;
        }
    },
    _4 {
        @Override
        public KeyPad2 up() {
            return KeyPad2._4;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._8;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._3;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._4;
        }
    },
    _5 {
        @Override
        public KeyPad2 up() {
            return KeyPad2._5;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._5;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._5;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._6;
        }
    },
    _6 {
        @Override
        public KeyPad2 up() {
            return KeyPad2._2;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._A;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._5;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._7;
        }
    },
    _7 {
        @Override
        public KeyPad2 up() {
            return KeyPad2._3;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._B;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._6;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._8;
        }
    },
    _8 {
        @Override
        public KeyPad2 up() {
            return KeyPad2._4;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._C;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._7;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._9;
        }
    },
    _9 {
        @Override
        public KeyPad2 up() {
            return KeyPad2._9;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._9;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._8;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._9;
        }
    },
    _A {
        @Override
        public KeyPad2 up() {
            return KeyPad2._6;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._A;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._A;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._B;
        }
    },
    _B {
        @Override
        public KeyPad2 up() {
            return KeyPad2._7;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._D;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._A;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._C;
        }
    },
    _C {
        @Override
        public KeyPad2 up() {
            return KeyPad2._8;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._C;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._B;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._C;
        }
    },
    _D {
        @Override
        public KeyPad2 up() {
            return KeyPad2._B;
        }

        @Override
        public KeyPad2 down() {
            return KeyPad2._D;
        }

        @Override
        public KeyPad2 left() {
            return KeyPad2._D;
        }

        @Override
        public KeyPad2 right() {
            return KeyPad2._D;
        }
    }
}
