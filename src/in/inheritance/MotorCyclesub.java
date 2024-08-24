package in.inheritance;


import in.kgCoding.VehicleSub;

class MotorCyclesub extends VehicleSub
{
    MotorCyclesub()
    {
      setTier(4);
      getTier();
    }

    static class twoVehiclesub extends VehicleSub {
    protected  void fuel()
    {
        System.out.printf("\nI Have %d Litre Fuel.",4);
    }
    }
}
