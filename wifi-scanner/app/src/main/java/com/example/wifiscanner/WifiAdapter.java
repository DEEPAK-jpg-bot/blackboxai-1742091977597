package com.example.wifiscanner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class WifiAdapter extends RecyclerView.Adapter<WifiAdapter.WifiViewHolder> {
    private List<WifiNetwork> wifiNetworks;

    public WifiAdapter() {
        this.wifiNetworks = new ArrayList<>();
    }

    @NonNull
    @Override
    public WifiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_wifi_network, parent, false);
        return new WifiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WifiViewHolder holder, int position) {
        WifiNetwork network = wifiNetworks.get(position);
        holder.bind(network);
    }

    @Override
    public int getItemCount() {
        return wifiNetworks.size();
    }

    public void updateNetworks(List<WifiNetwork> networks) {
        this.wifiNetworks = new ArrayList<>(networks);
        notifyDataSetChanged();
    }

    static class WifiViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvSSID;
        private final TextView tvBSSID;
        private final TextView tvManufacturer;
        private final TextView tvIPAddress;
        private final TextView tvSignalStrength;
        private final TextView tvFrequency;

        public WifiViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSSID = itemView.findViewById(R.id.tvSSID);
            tvBSSID = itemView.findViewById(R.id.tvBSSID);
            tvManufacturer = itemView.findViewById(R.id.tvManufacturer);
            tvIPAddress = itemView.findViewById(R.id.tvIPAddress);
            tvSignalStrength = itemView.findViewById(R.id.tvSignalStrength);
            tvFrequency = itemView.findViewById(R.id.tvFrequency);
        }

        public void bind(WifiNetwork network) {
            tvSSID.setText(network.getSsid());
            tvBSSID.setText(itemView.getContext().getString(R.string.bssid, network.getBssid()));
            tvManufacturer.setText(itemView.getContext().getString(R.string.manufacturer, 
                network.getManufacturer()));
            tvIPAddress.setText(itemView.getContext().getString(R.string.ip_address, 
                network.getIpAddress()));
            tvSignalStrength.setText(itemView.getContext().getString(R.string.signal_strength, 
                network.getSignalStrength()));
            tvFrequency.setText(itemView.getContext().getString(R.string.frequency, 
                network.getFrequency()));
        }
    }
}
