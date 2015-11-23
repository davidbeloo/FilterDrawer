package com.thepinkandroid.filterdrawer.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.thepinkandroid.filterdrawer.R;
import com.thepinkandroid.filterdrawer.custom.FilterItemViewHolder;
import com.thepinkandroid.filterdrawer.models.Category;

import java.util.ArrayList;


/**
 * Created by DAVID BELOOSESKY on 09/12/2014.
 */
public class FilterRecyclerAdapter extends RecyclerView.Adapter<FilterItemViewHolder>
{
    private ArrayList<Category> mItems;
    private Context mContext;

    public FilterRecyclerAdapter(Context context)
    {
        mContext = context;
        mItems = generateCategories();
    }

    private ArrayList<Category> generateCategories()
    {
        ArrayList<Category> categoriesList = new ArrayList<>();
        categoriesList.add(new Category(0, "Category 0"));
        categoriesList.add(new Category(1, "Category 1"));
        categoriesList.add(new Category(2, "Category 2"));
        categoriesList.add(new Category(3, "Category 3"));
        categoriesList.add(new Category(4, "Category 4"));
        categoriesList.add(new Category(5, "Category 5"));
        categoriesList.add(new Category(6, "Category 6"));
        categoriesList.add(new Category(7, "Category 7"));
        return categoriesList;
    }

    @Override
    public FilterItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.filter_list_item, parent, false);
        return new FilterItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(FilterItemViewHolder holder, final int position)
    {
        final Category category = mItems.get(position);
        holder.nameTextView.setText(category.getName());
        setActionsLogic(holder, position);
    }

    private void setActionsLogic(FilterItemViewHolder holder, final int position)
    {
        final Category category = mItems.get(position);
        holder.checkBox.setChecked(false);
        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                {
                    Toast.makeText(mContext, "Position: " + position + " Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        holder.itemView.setTag(category);
    }

    @Override
    public int getItemCount()
    {
        return mItems.size();
    }
}
