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


class SensorMemory extends Sensor{

        private int memoryPositions;
        private double memory[];

        public SensorMemory(int memoryPositions, double value)
        {
                //this.value = value; use
		super(value);
                this.memoryPositions = memoryPositions;
                memory = new double[memoryPositions]; 
                memory[0] = value;
        }

        public double[] getOldValue()
        {
                return memory;
        }

}
