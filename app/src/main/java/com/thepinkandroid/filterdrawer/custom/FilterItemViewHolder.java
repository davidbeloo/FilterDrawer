package com.thepinkandroid.filterdrawer.custom;

/*
 * Copyright (C) 2015 Paul Burke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.thepinkandroid.filterdrawer.R;


public class FilterItemViewHolder extends RecyclerView.ViewHolder
{
    public View view;
    public final TextView nameTextView;
    public final CheckBox checkBox;

    public FilterItemViewHolder(View itemView)
    {
        super(itemView);
        view = itemView;
        nameTextView = (TextView) itemView.findViewById(R.id.itemNameTextView);
        checkBox = (CheckBox) itemView.findViewById(R.id.itemCheckBox);
    }
}