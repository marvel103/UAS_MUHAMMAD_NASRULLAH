package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Cacing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ular;
import simple.example.hewanpedia.model.Ulat;

public class DataProvider {
    public static List<Hewan> hewans;

    static {
        hewans = new ArrayList<>();
    }

    private static List<Ular> initDataUlar(Context ctx) {
        List<Ular> ulars = new ArrayList<>();
        ulars.add(new Ular(ctx.getString(R.string.sanca_nama),ctx.getString(R.string.sanca_asal),
                ctx.getString(R.string.sanca_deskripsi), R.drawable.ular1));
        ulars.add(new Ular(ctx.getString(R.string.anakonda_nama),ctx.getString(R.string.anakonda_asal),
                ctx.getString(R.string.anakonda_deskripsi), R.drawable.ular2));
        ulars.add(new Ular(ctx.getString(R.string.lamperpoltis_nama),ctx.getString(R.string.lamperpoltis_asal),
                ctx.getString(R.string.lamperpoltis_deskripsi), R.drawable.ular3));
        ulars.add(new Ular(ctx.getString(R.string.mamba_nama),ctx.getString(R.string.mamba_asal),
                ctx.getString(R.string.mamba_deskripsi), R.drawable.ular4));
        return ulars;
    }


    private static List<Cacing> initDataCacing(Context ctx) {
        List<Cacing> cacings = new ArrayList<>();
        cacings.add(new Cacing(ctx.getString(R.string.trichuris_trichiura_nama),ctx.getString(R.string.trichuris_trichiura_asal),
                ctx.getString(R.string.trichuris_trichiura_deskripsi),R.drawable.cacing1));
        cacings.add(new Cacing(ctx.getString(R.string.cacing_gelang_nama),ctx.getString(R.string.cacing_gelang_asal),
                ctx.getString(R.string.cacing_gelang_deskripsi),R.drawable.cacing2));
        cacings.add(new Cacing(ctx.getString(R.string.cacing_gelang_nama),ctx.getString(R.string.cacing_gelang_asal),
                ctx.getString(R.string.cacing_americanus_deskripsi), R.drawable.cacing3));
        cacings.add(new Cacing(ctx.getString(R.string.cacing_entrobius_nama),ctx.getString(R.string.cacing_entrobius_asal),
                ctx.getString(R.string.cacing_entrobius_deskripsi), R.drawable.cacing4));
        return cacings;
    }
    private static List<Ulat> initDataUlat(Context ctx) {
        List<Ulat> ulats = new ArrayList<>();
        ulats.add(new Ulat(ctx.getString(R.string.ulat_harimaui_sabela_nama),ctx.getString(R.string.ulat_harimaui_sabela_asal),
                ctx.getString(R.string.ulat_harimaui_sabela_deskripsi), R.drawable.ulat1));
        ulats.add(new Ulat(ctx.getString(R.string.ulat_processionary_nama),ctx.getString(R.string.ulat_processionary_asal),
                ctx.getString(R.string.ulat_processionary_deskripsi), R.drawable.ulat2));
        ulats.add(new Ulat(ctx.getString(R.string.ulat_arna_peseudoconspersa_nama),ctx.getString(R.string.ulat_arna_peseudoconspersa_asal),
                ctx.getString(R.string.ulat_arna_peseudoconspersa_deskripsi), R.drawable.ulat3));
        ulats.add(new Ulat(ctx.getString(R.string.ulat_manduca_sexta_nama),ctx.getString(R.string.ulat_manduca_sexta_asal),
                ctx.getString(R.string.ulat_manduca_sexta_deskripsi), R.drawable.ulat4));

        return ulats;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataUlar(ctx));
        hewans.addAll(initDataCacing(ctx));
        hewans.addAll(initDataUlat(ctx));
    }
    @SuppressWarnings("unused")
    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}