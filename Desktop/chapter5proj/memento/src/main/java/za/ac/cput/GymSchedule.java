package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class GymSchedule {

    int trainDays;
    int offDays;

    public GymSchedule(int  trainDays, int offDays)
    {
        this.trainDays = trainDays;
        this.offDays = offDays;
    }

    public String toString()
    {
        return "train days: " +trainDays + " and off days: " +offDays;
    }

    public SaveInfo save()
    {
        return new SaveInfo(trainDays, offDays);
    }

    public void restore(Object objSaveInfo)
    {
        SaveInfo ment = (SaveInfo) objSaveInfo;
    }

    private class SaveInfo{

        int saveTrainingDays;
        int saveOffDays;

        public SaveInfo(int trainingDays, int offDays)
        {
            saveTrainingDays = trainingDays;
            saveOffDays = offDays;
        }
    }
}
