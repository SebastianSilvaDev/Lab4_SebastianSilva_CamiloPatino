package com.comp.lab4_sebastiansilva.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.comp.lab4_sebastiansilva.R
import com.comp.lab4_sebastiansilva.models.Patient

class PatientAdapter(private val patients: List<Patient>) : RecyclerView.Adapter<PatientAdapter.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameView: TextView
        val roomView: TextView

        init {
            nameView = view.findViewById(R.id.name_text)
            roomView = view.findViewById(R.id.patient_room)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.patient_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val patient = patients[position]
        holder.nameView.text = patient.firstName + " " + patient.lastName
        holder.nameView.text = patient.room.toString()
    }

    override fun getItemCount(): Int {
        return patients.size
    }
}