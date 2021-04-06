package propensi.tugas.pebelco.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="produk")
public class ProdukModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produk", nullable = false)
    private Long idProduk;

    @NotNull
    @Size(max = 50)
    @Column(name = "nama_produk", nullable = false)
    private String namaProduk;

    @NotNull
    @Column(name = "stok", nullable = false)
    private Integer stok;

    @NotNull
    @Column(name = "harga", nullable = false)
    private Long harga;

    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "tanggal_dibuat", nullable = false)
    private Date tanggal_dibuat;

    @NotNull
    @Column(name = "tipe", nullable = false)
    private Integer tipe;

    @Size(max = 250)
    @Column(name = "spesifikasi", nullable = true)
    private String spesifikasi;

    @ManyToMany(mappedBy = "listProduk")
    private List<TagProdukModel> listTagProduk;


    public Long getIdProduk() {
        return this.idProduk;
    }

    public void setIdProduk(Long idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return this.namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public Integer getStok() {
        return this.stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public Long getHarga() {
        return this.harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    public Date getTanggal_dibuat() {
        return this.tanggal_dibuat;
    }

    public void setTanggal_dibuat(Date tanggal_dibuat) {
        this.tanggal_dibuat = tanggal_dibuat;
    }

    public Integer getTipe() {
        return this.tipe;
    }

    public void setTipe(Integer tipe) {
        this.tipe = tipe;
    }

    public String getSpesifikasi() {
        return this.spesifikasi;
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public List<TagProdukModel> getListTagProduk() {
        return this.listTagProduk;
    }

    public void setListTagProduk(List<TagProdukModel> listTagProduk) {
        this.listTagProduk = listTagProduk;
    }

}
