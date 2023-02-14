package com.example.test.presentation.fragments.home_fragment.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.test.databinding.ItemNoteBinding
import com.example.test.domain.model.Note

class NoteItemAdapter(
    private val list: List<Note>
) : Adapter<NoteItemViewHolder>() {

//    var onItemClickListener: ((Note) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteItemViewHolder {
        return NoteItemViewHolder(
            ItemNoteBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NoteItemViewHolder, position: Int) {
        holder.onBind(list[position])
/*        holder.itemView.setOnClickListener {
            onItemClickListener?.invoke(list[position])
        }
*/
    }

    override fun getItemCount() = list.size

}