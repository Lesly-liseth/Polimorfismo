public class Sueldo {


        private float sueldo;

        public void setSueldo() {

            sueldo = 375.37f;
        }


        public void setSueldo(float sueldoIngeniero) {

            sueldoIngeniero = sueldo * 3;
            sueldo = sueldoIngeniero;
        }
        float getSueldo() {

                return sueldo;

        }


    }


