/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaed;
import java.time.LocalDate;
 
public class Cache {
    private String code;
    private String name;
    private String state;
    private String owner;
    private double latitude;
    private double longitude;
    private CacheType kind;
    private CacheSize size;
    private double difficulty;
    private double terrain;
    private boolean isAvailable;
    private LocalDate hiddenDate;
    private int encontrado;
    private int naoEncontrado;
    private int favoritos;
    private int altitude;
 
    public Cache(String code, String name, String state, String owner, double latitude, double longitude, CacheType kind, CacheSize size, double difficulty, double terrain, boolean isAvailable, LocalDate hiddenDate, int encontrado, int naoEncontrado, int favoritos, int altitude) {
        this.code = code;
        this.name = name;
        this.state = state;
        this.owner = owner;
        this.latitude = latitude;
        this.longitude = longitude;
        this.kind = kind;
        this.size = size;
        this.difficulty = difficulty;
        this.terrain = terrain;
        this.isAvailable = isAvailable;
        this.hiddenDate = hiddenDate;
        this.encontrado = encontrado;
        this.naoEncontrado = naoEncontrado;
        this.favoritos = favoritos;
        this.altitude = altitude;
    }
 
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        if (code.length() > 11) {
            code = "XXXXXXXXXXX";
        }
        this.code = code;
 
    }

    @Override
    public String toString() {
        return "Cache{" + "code=" + code + ", name=" + name + ", state=" + state + ", owner=" + owner + ", latitude=" + latitude + ", longitude=" + longitude + ", kind=" + kind + ", size=" + size + ", difficulty=" + difficulty + ", terrain=" + terrain + ", isAvailable=" + isAvailable + ", hiddenDate=" + hiddenDate + ", encontrado=" + encontrado + ", naoEncontrado=" + naoEncontrado + ", favoritos=" + favoritos + ", altitude=" + altitude + '}';
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("O nome não pode ser nulo");
        this.name = name;
    }
 
    public String getState() {
        return state;
    }
 
    public void setState(String state) {
        if (state == null) throw new IllegalArgumentException("A localização não pode ser nulo");
        this.state = state;
    }
 
    public String getOwner() {
        return owner;
    }
 
    public void setOwner(String owner) {
        if (owner == null) throw new IllegalArgumentException("O dono da cache não pode ser nulo");
        this.owner = owner;
    }
 
    public double getLatitude() {
        return latitude;
    }
 
    public void setLatitude(double latitude) {
        if (latitude < -90 && latitude > 90) throw new IllegalArgumentException("Latitude inválida");
        this.latitude = latitude;
    }
 
    public double getLongitude() {
        return longitude;
    }
 
    public void setLongitude(double longitude) {
        if (longitude < -180 && longitude > 180) throw new IllegalArgumentException("Longitude inválida");
        this.longitude = longitude;
    }
 
    public CacheType getKind() {
        return kind;
    }
 
    public void setKind(CacheType kind) {
        if (kind == null) throw new IllegalArgumentException("Tipo de cache inválido");
        this.kind = kind;
    }
 
    public CacheSize getSize() {
        return size;
    }
 
    public void setSize(CacheSize size) {
        if (size == null) throw new IllegalArgumentException("Tamanho de cache inválido");
        this.size = size;
    }
 
    public double getDifficulty() {
        return difficulty;
    }
 
    public void setDifficulty(double difficulty) {
        if (difficulty < 0 || difficulty > 5.0)
            if (kind == null) throw new IllegalArgumentException("Dificuldade inválida");
        this.difficulty = difficulty;
    }
 
    public double getTerrain() {
        return terrain;
    }
 
    public void setTerrain(double terrain) {
        if (terrain < 0 || terrain > 5.0) if (kind == null) throw new IllegalArgumentException("Terreno inválido");
        this.terrain = terrain;
    }
 
    public boolean isAvailable() {
        return isAvailable;
    }
 
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
 
    public LocalDate getHiddenDate() {
        return hiddenDate;
    }
 
    public void setHiddenDate(LocalDate hiddenDate) {
        if (hiddenDate == null || hiddenDate.compareTo(LocalDate.now()) > 1)
            throw new IllegalArgumentException("Data inválida");
        this.hiddenDate = hiddenDate;
    }
 
    public int getEncontrado() {
        return encontrado;
    }
 
    public void setEncontrado(int encontrado) {
        if (encontrado < 0)
            throw new IllegalArgumentException("Encontrado tem de ser 0 ou superior");
        this.encontrado = encontrado;
    }
 
    public int getNaoEncontrado() {
        return naoEncontrado;
    }
 
    public void setNaoEncontrado(int naoEncontrado) {
        if (naoEncontrado < 0)
            throw new IllegalArgumentException("Não encontrado tem de ser 0 ou superior");
        this.naoEncontrado = naoEncontrado;
    }
 
    public int getFavoritos() {
        return favoritos;
    }
 
    public void setFavoritos(int favoritos) {
        if (favoritos < 0)
            throw new IllegalArgumentException("Favorito tem de ser 0 ou superior");
 
        this.favoritos = favoritos;
    }
 
    public int getAltitude() {
        return altitude;
    }
 
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}