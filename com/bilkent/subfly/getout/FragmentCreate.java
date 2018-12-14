package com.bilkent.subfly.getout;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import Model.Event;
import Model.GameEvent;
import Model.GroupWorkEvent;
import Model.MealEvent;
import Model.SportEvent;
import Model.TransportationEvent;

/**
 * @author :Ali Taha Dincer
 */

public class FragmentCreate extends Fragment {

    private static final String TAG = "Creator Created...";
    private Calendar calendar = Calendar.getInstance();

    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("server/saving-data/fireblog");

    DatePickerDialog.OnDateSetListener newDate = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateDate();
        }
    };

    TimePickerDialog.OnTimeSetListener newTime = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
            calendar.set(Calendar.MINUTE, minute);
            updateTime();
        }
    };

    private EditText name;
    private TextInputEditText eventNamePlaceHolder;
    private Spinner type;
    private TextInputEditText placePlaceHolder;
    private EditText date;
    private EditText time;
    private EditText numberOfParticipants;
    private EditText descriptionPlaceHolder;
    private Button create;
    private Button discard;
    private Event event;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout_create, container, false);
        name = (EditText) view.findViewById(R.id.userName);
        eventNamePlaceHolder = (TextInputEditText) view.findViewById(R.id.eventNamePlaceHolder);
        type = (Spinner) view.findViewById(R.id.type);
        placePlaceHolder = (TextInputEditText) view.findViewById(R.id.placePlaceHolder);
        date = (EditText) view.findViewById(R.id.date);
        time = (EditText) view.findViewById(R.id.time);
        numberOfParticipants = (EditText) view.findViewById(R.id.numberOfParticipants);
        descriptionPlaceHolder = (EditText) view.findViewById(R.id.descriptionPlaceHolder);
        create = (Button) view.findViewById(R.id.save);
        discard = (Button) view.findViewById(R.id.discard);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.event_types));
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        type.setAdapter(adapter);

        Log.d(TAG,"Creator started...");

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(getActivity(), newDate, calendar
                        .get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TimePickerDialog(getActivity(), newTime, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), true).show();
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).getmViewPager().setCurrentItem(1);
                Toast.makeText(getActivity(), "Event Created, Now GETOUT!", Toast.LENGTH_SHORT).show();
            }
        });

        discard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).getmViewPager().setCurrentItem(1);
                Toast.makeText(getActivity(), "Event Discarded", Toast.LENGTH_SHORT).show();
            }
        });

        type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if ( position == 0 ){
//                    event = new SportEvent(name.getText().toString(), placePlaceHolder.getText().toString(), date.getText().toString(), time.getText().toString(), Integer.parseInt(numberOfParticipants.getText().toString()), descriptionPlaceHolder.getText().toString());
//                }else if ( position == 1){
//                    event = new TransportationEvent(name.getText().toString(), placePlaceHolder.getText().toString(), date.getText().toString(), time.getText().toString(), Integer.parseInt(numberOfParticipants.getText().toString()), descriptionPlaceHolder.getText().toString());
//                }else if ( position == 2 ){
//                    event = new MealEvent(name.getText().toString(), placePlaceHolder.getText().toString(), date.getText().toString(), time.getText().toString(), Integer.parseInt(numberOfParticipants.getText().toString()), descriptionPlaceHolder.getText().toString());
//                }else if ( position == 3 ){
//                    event = new GameEvent(name.getText().toString(), placePlaceHolder.getText().toString(), date.getText().toString(), time.getText().toString(), Integer.parseInt(numberOfParticipants.getText().toString()), descriptionPlaceHolder.getText().toString());
//                }else if ( position == 4 ){
//                    event = new GroupWorkEvent(name.getText().toString(), placePlaceHolder.getText().toString(), date.getText().toString(), time.getText().toString(), Integer.parseInt(numberOfParticipants.getText().toString()), descriptionPlaceHolder.getText().toString());
//                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //do nothing
            }
        });

        return view;
    }

    public Fragment newInstance(){
        return this;
    }

    private void updateDate() {
        String myFormat = "dd/MM/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        date.setText(sdf.format(calendar.getTime()));
    }

    private void updateTime(){
        String myFormat = "HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.ROOT);
        time.setText(sdf.format(calendar.getTime()));
    }

}
