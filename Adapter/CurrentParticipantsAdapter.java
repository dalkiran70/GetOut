package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bilkent.subfly.getout.ParticipantsActivity;
import com.bilkent.subfly.getout.R;

import Model.User;
import Model.UserList;

/**
 * @author : Caglar Cankaya
 */

public class CurrentParticipantsAdapter extends RecyclerView.Adapter<CurrentParticipantsAdapter.CurrentParticipantsViewHolder>{

    private Context context;
    private UserList userList;

    public CurrentParticipantsAdapter( Context context, UserList userList){
        this.context = context;
        this.userList = userList;
    }

    public CurrentParticipantsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.participants_list,viewGroup,false);
        return new CurrentParticipantsViewHolder(view);
    }


    public void onBindViewHolder(CurrentParticipantsViewHolder currentParticipantsViewHolder, int i) {
        User user = userList.get(i);
        currentParticipantsViewHolder.photo.setImageResource(R.drawable.calendar_colored);
        currentParticipantsViewHolder.pic2.setImageResource(R.drawable.calendar_colored);
        currentParticipantsViewHolder.name.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }


    public class CurrentParticipantsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView photo;
        private ImageView pic2;
        private TextView name;

        public CurrentParticipantsViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            pic2 = itemView.findViewById(R.id.userImage2);
            photo = itemView.findViewById(R.id.userImage);
            name = itemView.findViewById(R.id.userName);
        }

        @Override
        public void onClick(View view) {
            //Get position of the row clicked
            int position = getAdapterPosition();
            User user = userList.get(position);
            Intent intent = new Intent(context,ParticipantsActivity.class);
            intent.putExtra("name",user.getName());
            context.startActivity(intent);
        }
    }




}