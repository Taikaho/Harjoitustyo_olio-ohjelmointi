package taho.oliokurssi.harjoitustyo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LutemonListAdapter extends RecyclerView.Adapter<LutemonViewHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();

    public LutemonListAdapter(Context context, ArrayList<Lutemon> lutemons) {
        this.context = context;
        this.lutemons = lutemons;
    }

    //public LutemonListAdapter(Context applicationContext, ArrayList<Lutemon> allLutemons, RadioGroup moveDestination) {
//
    //}

    @NonNull
    @Override
    public LutemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LutemonViewHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LutemonViewHolder holder, int position) {
        holder.name.setText(lutemons.get(position).getName() + " (" + lutemons.get(position).getColor() + ")");
        holder.attack.setText(String.valueOf("Hyökkäys: " + lutemons.get(position).getAttack()));
        holder.defence.setText(String.valueOf("Puolustus: " + lutemons.get(position).getDefence()));
        holder.health.setText("Elämä: " + lutemons.get(position).getHealth() + " / " + lutemons.get(position).getMaxHealth());
        holder.experience.setText(String.valueOf("Kokemus: " + lutemons.get(position).getExperience()));

        Location location = lutemons.get(position).getLocation();
        String locationString = "";
        switch (location) {
            case HOME:
                locationString = "Kotona";
                break;
            case TRAINING_AREA:
                locationString = "Harjoittelemassa";
                break;
            case BATTLEFIELD:
                locationString = "Taistelukentällä";
                break;
        }
        holder.location.setText(locationString);


 /*
        int pos = holder.getAdapterPosition();
        Location locationButtons = lutemons.get(pos).getLocation();
        if (locationButtons == Location.HOME) {
            holder.toTraining.setVisibility(View.VISIBLE);
            holder.toBattlefield.setVisibility(View.VISIBLE);
        }
        else if (locationButtons == Location.TRAINING_AREA) {
            holder.toHome.setVisibility(View.VISIBLE);
            holder.toBattlefield.setVisibility(View.VISIBLE);
        }
        else {
            holder.toTraining.setVisibility(View.VISIBLE);
            holder.toHome.setVisibility(View.VISIBLE);
        }


       /* holder.moveLutemon.setOnClickListener(view -> {
            RadioGroup rgMoveTo = holder.moveTo;
            if (rgMoveTo.getCheckedRadioButtonId() == R.id.rbToHome) {
                Home.getInstance().moveToHome(lutemons.get(pos));
            }
            else if  (rgMoveTo.getCheckedRadioButtonId() == R.id.rbToTraining) {
                TrainingArea.getInstance().moveToTrainingArea(lutemons.get(pos));
            }
            else {
                Battlefield.getInstance().moveToBattlefield(lutemons.get(pos));
            }
            notifyDataSetChanged();

        });
        */


    }

    @Override
    public int getItemCount() {
        return lutemons.size();
    }
}


