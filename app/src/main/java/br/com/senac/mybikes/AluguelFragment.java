package br.com.senac.mybikes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class AluguelFragment extends Fragment {

    Button btnMensagem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_aluguel, container, false);

        //Código vai entre a classe View e o return.

        btnMensagem = view.findViewById(R.id.btnMensagem);

        btnMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),
                        "Mensagem",
                        Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}