public class VirtualPet
{
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int ageYears;
    private int ageMonths;

    public VirtualPet(String petName)
    {
        name = petName;
        energyLevel = 0;
        happinessLevel = 0;
        weight = 5;
        ageYears = 0;
        ageMonths = 0;
    }

    public String getName() 
    {
        return name;
    }

    public String toString()
    {
        String info = name + "'s Information:\n";
        info += "Energy: " + energyLevel + "\n";
        info += "Happiness: " + happinessLevel + "\n";
        info += "Weight: " + weight + "g\n";
        info += "Age: " + ageMonths + " months and " + ageYears + " years";
        return info;
    }
}
