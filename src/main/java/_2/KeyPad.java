package _2;

/**
 * Created by kinder112 on 03.12.2016.
 */
enum KeyPad implements KeypadMovement<KeyPad> {
    _1 {
        @Override
        public KeyPad up() {
            return KeyPad._1;
        }

        @Override
        public KeyPad down() {
            return KeyPad._4;
        }

        @Override
        public KeyPad left() {
            return KeyPad._1;
        }

        @Override
        public KeyPad right() {
            return KeyPad._2;
        }
    },
    _2 {
        @Override
        public KeyPad up() {
            return KeyPad._2;
        }

        @Override
        public KeyPad down() {
            return KeyPad._5;
        }

        @Override
        public KeyPad left() {
            return KeyPad._1;
        }

        @Override
        public KeyPad right() {
            return KeyPad._3;
        }
    },
    _3 {
        @Override
        public KeyPad up() {
            return KeyPad._3;
        }

        @Override
        public KeyPad down() {
            return KeyPad._6;
        }

        @Override
        public KeyPad left() {
            return KeyPad._2;
        }

        @Override
        public KeyPad right() {
            return KeyPad._3;
        }
    },
    _4 {
        @Override
        public KeyPad up() {
            return KeyPad._1;
        }

        @Override
        public KeyPad down() {
            return KeyPad._7;
        }

        @Override
        public KeyPad left() {
            return KeyPad._4;
        }

        @Override
        public KeyPad right() {
            return KeyPad._5;
        }
    },
    _5 {
        @Override
        public KeyPad up() {
            return KeyPad._2;
        }

        @Override
        public KeyPad down() {
            return KeyPad._8;
        }

        @Override
        public KeyPad left() {
            return KeyPad._4;
        }

        @Override
        public KeyPad right() {
            return KeyPad._6;
        }
    },
    _6 {
        @Override
        public KeyPad up() {
            return KeyPad._3;
        }

        @Override
        public KeyPad down() {
            return KeyPad._9;
        }

        @Override
        public KeyPad left() {
            return KeyPad._5;
        }

        @Override
        public KeyPad right() {
            return KeyPad._6;
        }
    },
    _7 {
        @Override
        public KeyPad up() {
            return KeyPad._4;
        }

        @Override
        public KeyPad down() {
            return KeyPad._7;
        }

        @Override
        public KeyPad left() {
            return KeyPad._7;
        }

        @Override
        public KeyPad right() {
            return KeyPad._8;
        }
    },
    _8 {
        @Override
        public KeyPad up() {
            return KeyPad._5;
        }

        @Override
        public KeyPad down() {
            return KeyPad._8;
        }

        @Override
        public KeyPad left() {
            return KeyPad._7;
        }

        @Override
        public KeyPad right() {
            return KeyPad._9;
        }
    },
    _9 {
        @Override
        public KeyPad up() {
            return KeyPad._6;
        }

        @Override
        public KeyPad down() {
            return KeyPad._9;
        }

        @Override
        public KeyPad left() {
            return KeyPad._8;
        }

        @Override
        public KeyPad right() {
            return KeyPad._9;
        }
    }
}
