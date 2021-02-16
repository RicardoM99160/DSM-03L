package sv.edu.udb.dcomplementaria_guia3;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<Integer> num;

    public MutableLiveData<Integer> getNum(){
        if(num == null){
            num = new MutableLiveData<Integer>();
        }

        return num;
    }
}
