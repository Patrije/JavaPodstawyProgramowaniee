public enum Miesiace {

    STYCZEN(31),
    LUTY(28),
    MARZEC(31),
    KWIECIEN(30),
    MAJ(31);

        private int dniMiesiaca;

    Miesiace(int dniMiesiaca) {
        this.dniMiesiaca = dniMiesiaca;
    }

        public int getDniMiesiaca() {
            return dniMiesiaca;
        }
    }
