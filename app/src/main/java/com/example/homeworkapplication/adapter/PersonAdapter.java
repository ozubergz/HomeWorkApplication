package com.example.homeworkapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeworkapplication.databinding.ItemLayoutBinding;
import com.example.homeworkapplication.model.Person;

import java.util.List;

// TODO: 2/3/2021 Create adapter to take a List<Person>
public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private List<Person> people;

    public PersonAdapter(List<Person> people) {
        this.people = people;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemLayoutBinding binding;

        public ViewHolder(ItemLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void setPeople(Person person) {

            binding.tvDisplay.setText(person.getFirstName());
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemLayoutBinding binding = ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Person person = people.get(position);
        holder.setPeople(person);
    }

    @Override
    public int getItemCount() {
        return people.size();
    }



}
