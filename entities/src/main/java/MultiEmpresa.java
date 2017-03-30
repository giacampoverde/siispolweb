// default package
// Generated 30-mar-2017 11:07:53 by Hibernate Tools 5.2.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MultiEmpresa generated by hbm2java
 */
@Entity
@Table(name = "multi_empresa", schema = "comun", catalog = "siisspolweb")
public class MultiEmpresa implements java.io.Serializable {

	private int empresa;
	private String nombre;
	private String identificacion;
	private String representante;
	private String direccion;
	private String telefono;
	private String auditor;
	private String contador;
	private String rucContador;
	private byte[] logo;
	private String tipoArchivoLogo;
	private boolean principal;
	private String codigo;
	private String identificacionRep;
	private String nombreComercial;
	private String razonSocial;
	private String creacionUsuario;
	private Date creacionFecha;
	private String creacionEquipo;
	private String modificaUsuario;
	private Date modificaFecha;
	private String modificaEquipo;

	public MultiEmpresa() {
	}

	public MultiEmpresa(int empresa, String nombre, String identificacion, String representante, String direccion,
			String telefono, boolean principal, String creacionUsuario, Date creacionFecha, String creacionEquipo,
			String modificaUsuario, Date modificaFecha, String modificaEquipo) {
		this.empresa = empresa;
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.representante = representante;
		this.direccion = direccion;
		this.telefono = telefono;
		this.principal = principal;
		this.creacionUsuario = creacionUsuario;
		this.creacionFecha = creacionFecha;
		this.creacionEquipo = creacionEquipo;
		this.modificaUsuario = modificaUsuario;
		this.modificaFecha = modificaFecha;
		this.modificaEquipo = modificaEquipo;
	}

	public MultiEmpresa(int empresa, String nombre, String identificacion, String representante, String direccion,
			String telefono, String auditor, String contador, String rucContador, byte[] logo, String tipoArchivoLogo,
			boolean principal, String codigo, String identificacionRep, String nombreComercial, String razonSocial,
			String creacionUsuario, Date creacionFecha, String creacionEquipo, String modificaUsuario,
			Date modificaFecha, String modificaEquipo) {
		this.empresa = empresa;
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.representante = representante;
		this.direccion = direccion;
		this.telefono = telefono;
		this.auditor = auditor;
		this.contador = contador;
		this.rucContador = rucContador;
		this.logo = logo;
		this.tipoArchivoLogo = tipoArchivoLogo;
		this.principal = principal;
		this.codigo = codigo;
		this.identificacionRep = identificacionRep;
		this.nombreComercial = nombreComercial;
		this.razonSocial = razonSocial;
		this.creacionUsuario = creacionUsuario;
		this.creacionFecha = creacionFecha;
		this.creacionEquipo = creacionEquipo;
		this.modificaUsuario = modificaUsuario;
		this.modificaFecha = modificaFecha;
		this.modificaEquipo = modificaEquipo;
	}

	@Id

	@Column(name = "empresa", unique = true, nullable = false)
	public int getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}

	@Column(name = "nombre", nullable = false, length = 200)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "identificacion", nullable = false, length = 20)
	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	@Column(name = "representante", nullable = false, length = 100)
	public String getRepresentante() {
		return this.representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	@Column(name = "direccion", nullable = false, length = 200)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "telefono", nullable = false, length = 50)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "auditor", length = 100)
	public String getAuditor() {
		return this.auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	@Column(name = "contador", length = 100)
	public String getContador() {
		return this.contador;
	}

	public void setContador(String contador) {
		this.contador = contador;
	}

	@Column(name = "ruc_contador", length = 15)
	public String getRucContador() {
		return this.rucContador;
	}

	public void setRucContador(String rucContador) {
		this.rucContador = rucContador;
	}

	@Column(name = "logo")
	public byte[] getLogo() {
		return this.logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	@Column(name = "tipo_archivo_logo", length = 3)
	public String getTipoArchivoLogo() {
		return this.tipoArchivoLogo;
	}

	public void setTipoArchivoLogo(String tipoArchivoLogo) {
		this.tipoArchivoLogo = tipoArchivoLogo;
	}

	@Column(name = "principal", nullable = false)
	public boolean isPrincipal() {
		return this.principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	@Column(name = "codigo", length = 20)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "identificacion_rep", length = 15)
	public String getIdentificacionRep() {
		return this.identificacionRep;
	}

	public void setIdentificacionRep(String identificacionRep) {
		this.identificacionRep = identificacionRep;
	}

	@Column(name = "nombre_comercial", length = 200)
	public String getNombreComercial() {
		return this.nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	@Column(name = "razon_social", length = 200)
	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	@Column(name = "creacion_usuario", nullable = false, length = 20)
	public String getCreacionUsuario() {
		return this.creacionUsuario;
	}

	public void setCreacionUsuario(String creacionUsuario) {
		this.creacionUsuario = creacionUsuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creacion_fecha", nullable = false, length = 23)
	public Date getCreacionFecha() {
		return this.creacionFecha;
	}

	public void setCreacionFecha(Date creacionFecha) {
		this.creacionFecha = creacionFecha;
	}

	@Column(name = "creacion_equipo", nullable = false, length = 20)
	public String getCreacionEquipo() {
		return this.creacionEquipo;
	}

	public void setCreacionEquipo(String creacionEquipo) {
		this.creacionEquipo = creacionEquipo;
	}

	@Column(name = "modifica_usuario", nullable = false, length = 20)
	public String getModificaUsuario() {
		return this.modificaUsuario;
	}

	public void setModificaUsuario(String modificaUsuario) {
		this.modificaUsuario = modificaUsuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifica_fecha", nullable = false, length = 23)
	public Date getModificaFecha() {
		return this.modificaFecha;
	}

	public void setModificaFecha(Date modificaFecha) {
		this.modificaFecha = modificaFecha;
	}

	@Column(name = "modifica_equipo", nullable = false, length = 20)
	public String getModificaEquipo() {
		return this.modificaEquipo;
	}

	public void setModificaEquipo(String modificaEquipo) {
		this.modificaEquipo = modificaEquipo;
	}

}