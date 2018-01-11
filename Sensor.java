// Example of 4.3 from EDX java part:1

class Sensor
{
        private double value;

        public Sensor(double value)
        {
                this.value = value;
        }

        public void setValue(double value)
        {
                this.value = value;
        }

        public double getValue()
        {
                return value;
        }

        public void clearValue()
        {
                value = 0;
        }
}

class TestSensor
{
        public static void main(String []args)
        {
                Sensor a = new Sensor(0.0);
                Sensor b = new Sensor(10.0);

                System.out.println("(" +a.getValue()+" , "+b.getValue()+")");

                a.clearValue();

                b.clearValue();

                a.setValue(100.0);
                System.out.println("("+a.getValue()+" , "+b.getValue()+")");

        }
} 

