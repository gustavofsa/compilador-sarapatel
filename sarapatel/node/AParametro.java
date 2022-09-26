/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import analysis.*;
import sarapatel.analysis.Analysis;

@SuppressWarnings("nls")
public final class AParametro extends PParametro
{
    private PTipoParametro _tipoParametro_;
    private TId _id_;

    public AParametro()
    {
        // Constructor
    }

    public AParametro(
        @SuppressWarnings("hiding") PTipoParametro _tipoParametro_,
        @SuppressWarnings("hiding") TId _id_)
    {
        // Constructor
        setTipoParametro(_tipoParametro_);

        setId(_id_);

    }

    @Override
    public Object clone()
    {
        return new AParametro(
            cloneNode(this._tipoParametro_),
            cloneNode(this._id_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParametro(this);
    }

    public PTipoParametro getTipoParametro()
    {
        return this._tipoParametro_;
    }

    public void setTipoParametro(PTipoParametro node)
    {
        if(this._tipoParametro_ != null)
        {
            this._tipoParametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoParametro_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoParametro_)
            + toString(this._id_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoParametro_ == child)
        {
            this._tipoParametro_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoParametro_ == oldChild)
        {
            setTipoParametro((PTipoParametro) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
